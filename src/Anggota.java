import java.util.ArrayList;

public class Anggota {
  private String nomor;
  private String nama;
  private String alamat;
  private ArrayList<Buku> daftarPinjaman;

  public Anggota() {
    this.daftarPinjaman = new ArrayList<Buku>();
  }

  public Anggota(String nomor, String nama, String alamat) {
    this.nomor = nomor;
    this.nama = nama;
    this.alamat = alamat;
    this.daftarPinjaman = new ArrayList<Buku>();
  }

  public String getAlamat() {
    return this.alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public ArrayList<Buku> getDaftarPinjaman() {
    return daftarPinjaman;
  }

  public void setDaftarPinjaman(ArrayList<Buku> daftarPinjaman) {
    this.daftarPinjaman = daftarPinjaman;
  }

  public void pinjam(Buku buku) {
    this.daftarPinjaman.add(buku);
  }

  public Buku kembalikan(Buku buku) {
    if (this.daftarPinjaman.contains(buku)) {
      this.daftarPinjaman.remove(buku);
      return buku;
    } else {
      return null;
    }
  }

  public Buku searchBuku(String kode) {
    Buku temp = null;
    for (int x = 0; x < this.daftarPinjaman.size(); x++) {
      temp = (Buku) this.daftarPinjaman.get(x);
      if (temp.getKode().equalsIgnoreCase(kode))
        break;
    }
    return temp;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getNomor() {
    return nomor;
  }

  public void setNomor(String nomor) {
    this.nomor = nomor;
  }

}
