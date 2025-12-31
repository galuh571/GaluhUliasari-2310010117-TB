## Proyek UAS Pemrograman Berorientasi Objek 2
Aplikasi Rental Mobil (java Desktop)
Proyek ini merupakan aplikasi Rental Mobil berbasis Java GUI(Swing) yang dibuat sebagai tugas UAS pada Mata kuliah Pemrograman Berorientasi Objek 2. Aplikasi ini digunakan untuk mengelola data master, transaksi rental, serta laporan mobil terlaris yang terhubung langsung dengan database MySql dan diolah melalui JDBC.
## Deskripsi Aplikasi
Aplikasi Rental Mobil digunakan untuk mengelola proses penyewaan mobil mulai dari pendataan mobil,pelanggan,karyawan, hingga transaksi rental, pendapatan, dan laporan terlaris dan pengembalian.
Aplikasi ini berfungsi untuk:
1.Mengelola Data mobil
2.Mengelola Data pelanggan
3.Mengelola  Data karyawan
4.Melakukan transaksi penyewaan mobil
5.Menghitung jumlah penyewaan mobil
6.Menampilkan laporan terlaris
7.Menampilkan Laporan Pendapatan
8.Menyimpan data ke database mysql       
9.Menampilkan data  dalam  bentuk Jtable
10.Mengekspor Laporan ke File Txt
11.Menggunakan Konsep OOP lengkap

## Teknologi yang digunakan
Aplikasi ini dibuat menggunakan:
Java (JDK),NetBeans IDE,Java Swing (GUI),My SQL Database,JDBC(Java Database Connectivity),
Library Jkalender(JdateChooser),File Writer,(Export txt),XAMPP(Server Database)

## Tujuan Aplikasi 
1.Menggantikan Pencatatan Manual rental mobil Menjadi sistem digital
2.Memudahkan proses input,edit dan hapus data
3.Mengurangi kesalahan pencatatan transaksi
4.Menyediakan Laporan otomatis untuk keperluan manajemen

## Fitur Aplikasi
1.Master Data Mobil (CRUD)
2.Master Data Pelanggan(CRUD)
3.Master Data Karyawan(CRUD)
4.Melakukam Transaksi Rental Mobil
5.Mengelola Transaksi pengembalian
6.Menampilkan Laporan Mobil terlaris dan Menggunakan query GROUP BY dan COUNT
7.Menampilkan Laporan pendapatan dan menggunakan fungsi SUM

# Struktur Project: Aplikasi Rental Mobil : Menu Utama.Java , koneksi : Koneksi.java , master: FormMobil.java, FormKaryawan.java, FormPelanggan.java ,transaksi: FormRental.java dan FormPengembalian.java , laporan: FormMobilTerlaris.java dan FormPendapatan.java
# Komponen GUI
Top-Level Container : Jframe
Intermediate Container : JPanel, JscrollPane, GroupLayout
Atomic Component: JtextField, Jlabel, Jbutton, JcomboBox, JTable, JdateChooser,JtextArea.

# Konsep OOP yang diterapkan:
1.**Class** adalah blueprint atau cetakan objek. Contohnya:
bash
Public class FormMenuUtama extends Jframe { }
public class FormMobil extends JFrame { }
public class FormPelanggan extends JFrame { }
public class FormKaryawan extends JFrame { }
public class FormRental extends JFrame { }
public class FormPengembalian extends JFrame { }
public class LaporanMobilTerlaris extends JFrame { }
public class FormPendapatan extends JFrame { }

2. **Object** adalah instance dari class. Contohnya:
   bash
FormRental rental = new FormRental();

3.**Atribut** Atribut adalah variabel di dalam class. Contoh nya:
bash
private JTextField txtIdRental;
private JTable tblRental;
private JComboBox cbMobil;

4. **Constructor** dipanggil otomatis saat objek dibuat. Contohnya :
bash
public FormRental() {
    initComponents();
    tampilData();
    isicombomobil();
}


5.**Method** adalah fungsi/prosedur di dalam class. Contohnya:
bash
void tampilData() {
    // menampilkan data dari database ke JTable
}


6.**Encapsulation** Menyembunyikan data menggunakan private dan diakses melalui method. Contohnya :
bash
private JTextField txtTotal;


7.**Inheritance** Semua form GUI mewarisi class JFrame. Contohnya :
bash
public class FormRental extends Jframe{}


8.**Polymorphism** Satu method dapat digunakan untuk berbagai aksi (CRUD). Contohnya:
bash
btnSimpanActionPerformed(...)
btnUbahActionPerformed(...)
btnHapusActionPerformed(...)


9.**Abstraction** User hanya melihat GUI, sedangkan proses database dan SQL disembunyikan. Contoh:
  User klik tombol Simpan & Proses INSERT INTO rental tidak terlihat oleh user

  
10.**Seleksi**(Percabangan) Digunakan untuk validasi input. Contohnya :
bash
if (txtIdRental.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Pilih data terlebih dahulu");
}

11.**Perulangan(looping)** Digunakan untuk menampilkan data ke JTable. Contohnya:
bash
while (rs.next()) {
    model.addRow(new Object[]{
        rs.getString("no_plat"),
        rs.getString("no_ktp")
    });
}

12.**Array** Menggunakan DefaultTableModel untuk tabel. Contohnya:
bash
DefaultTableModel model = new DefaultTableModel();

13.**Error Handlling** Digunakan untuk mencegah error input dan koneksi. Contohnya:
bash
try {
    Integer.parseInt(txtTotal.getText());
} catch (Exception e) {
 JOptionPane.showMessageDialog(this, "Total harus angka!"); }

Laporan Mobil Terlaris Menggunakan query:
SELECT m.no_plat, m.merek, COUNT(r.id_rental) AS total_disewa
FROM rental r
JOIN mobil m ON r.no_plat = m.no_plat
GROUP BY m.no_plat, m.merek
ORDER BY total_disewa DESC

Laporan Pendapatan Menggunakan fungsi agregat:
SELECT SUM(total_bayar) FROM rental;

## Pembuat
Nama : Galuh Uliasari

NPM : 2310010117

Mata Kuliah : Pemrograman Berorientasi Objek 2

Tahun : 2025
