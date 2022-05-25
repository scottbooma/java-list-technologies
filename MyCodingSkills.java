public class MyCodingSkills {
    public static void main(String[] args){
        MyCodingSkills.printMySkills(myTechStack);
    }

    private static String[] myTechStack = {
        "git",
        "CLI",
        "HTML",
        "CSS",
        "JavaScript",
        "TypeScript",
        "Angular",
        "Testing",
    };

    private static void printMySkills(String[] skillsArray){
        for(String skill : skillsArray){
            System.out.println(skill);
        }
    }
}