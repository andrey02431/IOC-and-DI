public class LawSchool implements School{

    private String schoolName;
    private String amountOfStudents;
    private String modulesAvailable;

    private SloganGenerator slogan;

    public LawSchool(String schoolName, String amountOfStudents, String modulesAvailable){
        this.schoolName = schoolName;
        this.amountOfStudents = amountOfStudents;
        this.modulesAvailable = modulesAvailable;
    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String getAmountOfStudents() {
        return amountOfStudents;
    }

    @Override
    public String getModulesAvailable() {
        return modulesAvailable;
    }

    public void setSlogan(SloganGenerator slogan){
        this.slogan = slogan;
    }

    public String getSlogan(){
        return slogan.getSlogan();
    }


}
