package tesTechnicalSALT.ServBackEnd;

import jakarta.persistence.*;

import java.time.LocalDate;

@Table
@Entity(name = "db_customer")
public class UserData {

    @Id
    @SequenceGenerator(
            name = "db_customer",
            sequenceName = "db_customer",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "db_Customer"
    )
    @Column(
            name = "id",
            updatable = true
    )
    private Long id;

    @Column(
            name = "nama",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            name = "alamat",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String alamat;

    @Column(
            name = "kota",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String kota;

    @Column(
            name = "provinsi",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String provinsi;

    @Column(
            name = "tgl_regis",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private LocalDate tgl_regis;

    @Column(
            name = "ststus",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String status;

    public UserData(Long id,
                    String name,
                    String alamat,
                    String kota,
                    String provinsi,
                    LocalDate tgl_regis,
                    String status) {
        this.id = id;
        this.name = name;
        this.alamat = alamat;
        this.kota = kota;
        this.provinsi = provinsi;
        this.tgl_regis = tgl_regis;
        this.status = status;
    }

    public UserData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public LocalDate getTgl_regis() {
        return tgl_regis;
    }

    public void setTgl_regis(LocalDate tgl_regis) {
        this.tgl_regis = tgl_regis;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alamat='" + alamat + '\'' +
                ", kota='" + kota + '\'' +
                ", provinsi='" + provinsi + '\'' +
                ", tgl_regis=" + tgl_regis +
                ", status='" + status + '\'' +
                '}';
    }
}
