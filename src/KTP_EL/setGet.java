package KTP_EL;

public class setGet {
    private String nama;
    private String agama;
    private String jenisKelamin;
    private String pekerjaan;
    private String golonganDarah;
    private String kelurahan;
    private String RT;
    private String tempatLahir;
    private String tanggalLahir;
    private String kewarganegaraan;

    public setGet() {
    }

    public setGet(String nama, String agama, String jenisKelamin, String pekerjaan, String golonganDarah, String kelurahan, String RT, String tempatLahir, String tanggalLahir, String kewarganegaraan) {
        this.nama = nama;
        this.agama = agama;
        this.jenisKelamin = jenisKelamin;
        this.pekerjaan = pekerjaan;
        this.golonganDarah = golonganDarah;
        this.kelurahan = kelurahan;
        this.RT = RT;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
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

    public String getKelurahan() {
        return kelurahan;
    }

    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    public String getRT() {
        return RT;
    }

    public void setRT(String RT) {
        this.RT = RT;
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
