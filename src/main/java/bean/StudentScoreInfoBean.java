package bean;

public class StudentScoreInfoBean {
    private Integer id;

    private Integer s_id;

    private Integer course_id;

    private String score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getsId() {
        return s_id;
    }

    public void setsId(Integer sId) {
        this.s_id = sId;
    }

    public Integer getCourseId() {
        return course_id;
    }

    public void setCourseId(Integer courseId) {
        this.course_id = courseId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}