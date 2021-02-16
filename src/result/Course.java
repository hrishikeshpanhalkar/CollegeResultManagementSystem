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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "course", catalog = "result", schema = "")
@NamedQueries({
    @NamedQuery(name = "Course.findAll", query = "SELECT c FROM Course c")
    , @NamedQuery(name = "Course.findByCourseNo", query = "SELECT c FROM Course c WHERE c.courseNo = :courseNo")
    , @NamedQuery(name = "Course.findByCourseName", query = "SELECT c FROM Course c WHERE c.courseName = :courseName")
    , @NamedQuery(name = "Course.findByFaculty", query = "SELECT c FROM Course c WHERE c.faculty = :faculty")
    , @NamedQuery(name = "Course.findByDegree", query = "SELECT c FROM Course c WHERE c.degree = :degree")
    , @NamedQuery(name = "Course.findByCollegeType", query = "SELECT c FROM Course c WHERE c.collegeType = :collegeType")
    , @NamedQuery(name = "Course.findByDuration", query = "SELECT c FROM Course c WHERE c.duration = :duration")
    , @NamedQuery(name = "Course.findByCoursePattern", query = "SELECT c FROM Course c WHERE c.coursePattern = :coursePattern")
    , @NamedQuery(name = "Course.findByFeePattern", query = "SELECT c FROM Course c WHERE c.feePattern = :feePattern")})
public class Course implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CourseNo")
    private Integer courseNo;
    @Column(name = "CourseName")
    private String courseName;
    @Column(name = "Faculty")
    private String faculty;
    @Column(name = "Degree")
    private String degree;
    @Column(name = "CollegeType")
    private String collegeType;
    @Column(name = "Duration")
    private Integer duration;
    @Column(name = "CoursePattern")
    private String coursePattern;
    @Column(name = "FeePattern")
    private String feePattern;

    public Course() {
    }

    public Course(Integer courseNo) {
        this.courseNo = courseNo;
    }

    public Integer getCourseNo() {
        return courseNo;
    }

    public void setCourseNo(Integer courseNo) {
        Integer oldCourseNo = this.courseNo;
        this.courseNo = courseNo;
        changeSupport.firePropertyChange("courseNo", oldCourseNo, courseNo);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        String oldCourseName = this.courseName;
        this.courseName = courseName;
        changeSupport.firePropertyChange("courseName", oldCourseName, courseName);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        String oldFaculty = this.faculty;
        this.faculty = faculty;
        changeSupport.firePropertyChange("faculty", oldFaculty, faculty);
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        String oldDegree = this.degree;
        this.degree = degree;
        changeSupport.firePropertyChange("degree", oldDegree, degree);
    }

    public String getCollegeType() {
        return collegeType;
    }

    public void setCollegeType(String collegeType) {
        String oldCollegeType = this.collegeType;
        this.collegeType = collegeType;
        changeSupport.firePropertyChange("collegeType", oldCollegeType, collegeType);
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        Integer oldDuration = this.duration;
        this.duration = duration;
        changeSupport.firePropertyChange("duration", oldDuration, duration);
    }

    public String getCoursePattern() {
        return coursePattern;
    }

    public void setCoursePattern(String coursePattern) {
        String oldCoursePattern = this.coursePattern;
        this.coursePattern = coursePattern;
        changeSupport.firePropertyChange("coursePattern", oldCoursePattern, coursePattern);
    }

    public String getFeePattern() {
        return feePattern;
    }

    public void setFeePattern(String feePattern) {
        String oldFeePattern = this.feePattern;
        this.feePattern = feePattern;
        changeSupport.firePropertyChange("feePattern", oldFeePattern, feePattern);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (courseNo != null ? courseNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Course)) {
            return false;
        }
        Course other = (Course) object;
        if ((this.courseNo == null && other.courseNo != null) || (this.courseNo != null && !this.courseNo.equals(other.courseNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "result.Course[ courseNo=" + courseNo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
