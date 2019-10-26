package ua.lviv.iot.model;

import javax.persistence.*;

@Entity
@Table(name = "`department`", schema = "`shutka`")
public class DepartmentEntity {
    private Integer id;
    private String departmentTypeSize;
    private String cityName;
    private Integer number;
    private String address;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "department_type_size", nullable = false, length = 45)
    public String getDepartmentTypeSize() {
        return departmentTypeSize;
    }

    public void setDepartmentTypeSize(String departmentTypeSize) {
        this.departmentTypeSize = departmentTypeSize;
    }

    @Basic
    @Column(name = "city_name", nullable = false, length = 45)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "number", nullable = false)
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Basic
    @Column(name = "address", nullable = false, length = 45)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (departmentTypeSize != null ? !departmentTypeSize.equals(that.departmentTypeSize) : that.departmentTypeSize != null)
            return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (departmentTypeSize != null ? departmentTypeSize.hashCode() : 0);
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }
}