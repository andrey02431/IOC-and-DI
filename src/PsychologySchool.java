public class PsychologySchool implements School{

    private String schoolName;
    private String amountOfStudents;
    private String modulesAvailable;

    public PsychologySchool(String schoolName, String amountOfStudents, String modulesAvailable){
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
}
