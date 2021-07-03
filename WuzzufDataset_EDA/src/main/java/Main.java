

public class Main {

    public static void main(String[] args) {
       // DataHandler handler=new DataHandler("Resources/Wuzzuf_Jobs.csv");
        //handler.Process();
       String path = "Resources/Wuzzuf_Jobs.csv";
       
       JobDAO jdao = new JobDAO();
       jdao.ReadCSVFiles(path);
       /*
       for (Job j : jdao.Joblist){
        String title =j.getTitle();
        String company =j.getCompany();
        String location = j.getLocation();
        String type = j.getType();
        String level = j.getLevel();
        String yrsexp = j.getExperience();
        String country = j.getCountry();
        String skills = j.getSkillsList();
        
       System.out.println("\n"+title + "---"+company+"---"+location+"---"+type+"---"+level+"---"+yrsexp+ "---"+country+ "***"+skills +"***"+"\n");
        
   }
    */
       
       //Job j = new Job(path, path, path, path, path, path, path, path);
       
       /* Eshta gend
       JobDataset jd = new JobDataset();
       jd.JobsTitle(jdao.Joblist);
       jd.JobsCountry(jdao.Joblist);
       jd.JobsLevel(jdao.Joblist);
       jd.JobsYearsExperiance(jdao.Joblist);
       */
       Test.test();
    }
}
