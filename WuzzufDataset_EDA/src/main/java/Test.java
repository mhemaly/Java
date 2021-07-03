/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mostafa Wael Abdel Aziz Hanafy
 *      Sec 4
 */



class Test {
    public static void test(){
       String path = "Resources/Wuzzuf_Jobs.csv";
       JobDAO jdao = new JobDAO();
       jdao.ReadCSVFiles(path);
       //List<Job> Joblist = JobDAO.class.getMethods();
        //ArrayList<Job> Jos = jdao.ReadCSVFiles(path);
                //JobDAO.ReadCSVFiles(path);
        //ArrayList<String> jobs = jdao.ReadCSVFiles(path);
        JobDataset.JobsCompany(jdao.Joblist);
        JobDataset.JobsTitle(jdao.Joblist);
        JobDataset.JobsCountry(jdao.Joblist);
        JobDataset.JobsLevel(jdao.Joblist);
        JobDataset.JobsYearsExperiance(jdao.Joblist);
    
    }
    
}
