/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package result;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "mark", catalog = "result", schema = "")
@NamedQueries({
    @NamedQuery(name = "Mark.findAll", query = "SELECT m FROM Mark m")
    , @NamedQuery(name = "Mark.findByRollno", query = "SELECT m FROM Mark m WHERE m.rollno = :rollno")
    , @NamedQuery(name = "Mark.findByStudentName", query = "SELECT m FROM Mark m WHERE m.studentName = :studentName")
    , @NamedQuery(name = "Mark.findBySubCode", query = "SELECT m FROM Mark m WHERE m.subCode = :subCode")
    , @NamedQuery(name = "Mark.findBySubjectName", query = "SELECT m FROM Mark m WHERE m.subjectName = :subjectName")
    , @NamedQuery(name = "Mark.findByCredits", query = "SELECT m FROM Mark m WHERE m.credits = :credits")
    , @NamedQuery(name = "Mark.findByExternal", query = "SELECT m FROM Mark m WHERE m.external = :external")
    , @NamedQuery(name = "Mark.findByExternalGrade", query = "SELECT m FROM Mark m WHERE m.externalGrade = :externalGrade")
    , @NamedQuery(name = "Mark.findByInternal", query = "SELECT m FROM Mark m WHERE m.internal = :internal")
    , @NamedQuery(name = "Mark.findByInternalGrade", query = "SELECT m FROM Mark m WHERE m.internalGrade = :internalGrade")
    , @NamedQuery(name = "Mark.findByTotal", query = "SELECT m FROM Mark m WHERE m.total = :total")
    , @NamedQuery(name = "Mark.findByTotalGrade", query = "SELECT m FROM Mark m WHERE m.totalGrade = :totalGrade")
    , @NamedQuery(name = "Mark.findByGradepoints", query = "SELECT m FROM Mark m WHERE m.gradepoints = :gradepoints")
    , @NamedQuery(name = "Mark.findByCg", query = "SELECT m FROM Mark m WHERE m.cg = :cg")
    , @NamedQuery(name = "Mark.findBySgpi", query = "SELECT m FROM Mark m WHERE m.sgpi = :sgpi")})
public class Mark implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Roll_no")
    private Integer rollno;
    @Column(name = "StudentName")
    private String studentName;
    @Column(name = "SubCode")
    private String subCode;
    @Column(name = "SubjectName")
    private String subjectName;
    @Column(name = "Credits")
    private Integer credits;
    @Column(name = "External")
    private Integer external;
    @Column(name = "ExternalGrade")
    private String externalGrade;
    @Column(name = "Internal")
    private Integer internal;
    @Column(name = "InternalGrade")
    private String internalGrade;
    @Column(name = "Total")
    private Integer total;
    @Column(name = "TotalGrade")
    private String totalGrade;
    @Column(name = "Gradepoints")
    private Integer gradepoints;
    @Column(name = "CG")
    private Integer cg;
    @Column(name = "SGPI")
    private Integer sgpi;

    public Mark() {
    }

    public Mark(Integer rollno) {
        this.rollno = rollno;
    }

    public Integer getRollno() {
        return rollno;
    }

    public void setRollno(Integer rollno) {
        Integer oldRollno = this.rollno;
        this.rollno = rollno;
        changeSupport.firePropertyChange("rollno", oldRollno, rollno);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        String oldStudentName = this.studentName;
        this.studentName = studentName;
        changeSupport.firePropertyChange("studentName", oldStudentName, studentName);
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        String oldSubCode = this.subCode;
        this.subCode = subCode;
        changeSupport.firePropertyChange("subCode", oldSubCode, subCode);
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        String oldSubjectName = this.subjectName;
        this.subjectName = subjectName;
        changeSupport.firePropertyChange("subjectName", oldSubjectName, subjectName);
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        Integer oldCredits = this.credits;
        this.credits = credits;
        changeSupport.firePropertyChange("credits", oldCredits, credits);
    }

    public Integer getExternal() {
        return external;
    }

    public void setExternal(Integer external) {
        Integer oldExternal = this.external;
        this.external = external;
        changeSupport.firePropertyChange("external", oldExternal, external);
    }

    public String getExternalGrade() {
        return externalGrade;
    }

    public void setExternalGrade(String externalGrade) {
        String oldExternalGrade = this.externalGrade;
        this.externalGrade = externalGrade;
        changeSupport.firePropertyChange("externalGrade", oldExternalGrade, externalGrade);
    }

    public Integer getInternal() {
        return internal;
    }

    public void setInternal(Integer internal) {
        Integer oldInternal = this.internal;
        this.internal = internal;
        changeSupport.firePropertyChange("internal", oldInternal, internal);
    }

    public String getInternalGrade() {
        return internalGrade;
    }

    public void setInternalGrade(String internalGrade) {
        String oldInternalGrade = this.internalGrade;
        this.internalGrade = internalGrade;
        changeSupport.firePropertyChange("internalGrade", oldInternalGrade, internalGrade);
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        Integer oldTotal = this.total;
        this.total = total;
        changeSupport.firePropertyChange("total", oldTotal, total);
    }

    public String getTotalGrade() {
        return totalGrade;
    }

    public void setTotalGrade(String totalGrade) {
        String oldTotalGrade = this.totalGrade;
        this.totalGrade = totalGrade;
        changeSupport.firePropertyChange("totalGrade", oldTotalGrade, totalGrade);
    }

    public Integer getGradepoints() {
        return gradepoints;
    }

    public void setGradepoints(Integer gradepoints) {
        Integer oldGradepoints = this.gradepoints;
        this.gradepoints = gradepoints;
        changeSupport.firePropertyChange("gradepoints", oldGradepoints, gradepoints);
    }

    public Integer getCg() {
        return cg;
    }

    public void setCg(Integer cg) {
        Integer oldCg = this.cg;
        this.cg = cg;
        changeSupport.firePropertyChange("cg", oldCg, cg);
    }

    public Integer getSgpi() {
        return sgpi;
    }

    public void setSgpi(Integer sgpi) {
        Integer oldSgpi = this.sgpi;
        this.sgpi = sgpi;
        changeSupport.firePropertyChange("sgpi", oldSgpi, sgpi);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (rollno != null ? rollno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mark)) {
            return false;
        }
        Mark other = (Mark) object;
        if ((this.rollno == null && other.rollno != null) || (this.rollno != null && !this.rollno.equals(other.rollno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "result.Mark[ rollno=" + rollno + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
