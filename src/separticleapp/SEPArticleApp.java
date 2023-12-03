/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package separticleapp;

/**
 *
 * @author danma
 */
public class SEPArticleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SEPArticle article = new SEPArticle();
        article.setVisibility(true);
        //Article is an extract from an existing UN article that has been paraphrased, the extrat can be found @ https://sdgs.un.org/goals/goal2#progress_and_info
        article.setArticleText("Since 2015, there has been a rise in the number of people experiencing hunger and food insecurity, which can be attributed to a variety of factors such as the pandemic, conflicts, climate change, and growing inequalities. In 2015, there were 589 million people living in hunger; by 2021, that number had risen to 768 million. Projections indicate that by 2030, there will still be approximately 670 million people facing hunger, which equates to 8% of the world's population and represents the same amount as in 2015. Despite international efforts, a significant number of children continue to suffer from malnutrition, and the current annual rate of reduction in stunting must increase by 2.2 times to meet the global target. In order to achieve zero hunger by 2030, immediate and intensified efforts must be made to transform food systems, ensure food security, and invest in sustainable agricultural practices.");
    }
}
