package KTP_EL;

public class setGet {
    private String Nama;
    private String Agama;
    private char jenisKelamin;
    private String pekerjaan;
    private String golonganDarah;
    private String Alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String kewarganegaraan;

    public setGet(String Nama, String Agama, char jenisKelamin, String pekerjaan, String golonganDarah, String Alamat, String tempatLahir, String tanggalLahir, String kewarganegaraan) {
        this.Nama = Nama;
        this.Agama = Agama;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.golonganDarah = golonganDarah;
        this.Alamat = Alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }
    
}
