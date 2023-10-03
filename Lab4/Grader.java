/*
 * Writen By Pawit Thongkum
 * ID : 6530300970
 */
import java.util.ArrayList;

public class Grader {
    // Argumant
    private String name;
    private ArrayList<Double> score = new ArrayList<Double>();

    // constructor
    public Grader(String name){
        this.name = name;
    
    }
    // เพิ่มคะแนนลงใน ArrayList
    public void addScores(double score){
        this.score.add(score);
    }
    // นับจำนวนคนใน Class
    public int countStudents(){
        return score.size();
    }
    // หาค่าเฉลี่ย
    public double mean(){
        double result = 0;
        for (int i = 0; i < countStudents(); i++) {
            result += score.get(i);
        }
        return result /= countStudents();
    }
    // หาคำนวนคนที่ได้คะแนนตำกว่าค่าเฉลี่ย
    public int belowMean(){
        int belowCount = 0;
        for (int i = 0; i < countStudents(); i++) {
            if (score.get(i) < mean()) {
                belowCount++;
            }
        }
        return belowCount;
    }
    // หาคำนวนคนที่ได้คะแนนสูงกว่าค่าเฉลี่ย
    public int aboveMean(){
        int aboveMean = 0;
        for (int i = 0; i < countStudents(); i++) {
            if (score.get(i) > mean()){
                aboveMean++;
            }
        }
        return aboveMean;
    }
    // แสดงจำนวนคนที่ได้ในแต่ละเกรต
    public void showGrade(){
        int nA = 0, nBP = 0, nB = 0, nCP = 0, nC = 0, nDP = 0, nD = 0, nF = 0;
        for (int i = 0; i < countStudents(); i++) {
            if (score.get(i) >= 80) {
                nA++;
            }else if (score.get(i) >= 75) {
                nBP++;
            }else if (score.get(i) >= 70) {
                nB++;
            }else if (score.get(i) >= 65) {
                nCP++;
            }else if (score.get(i) >= 60) {
                nC++;
            }else if (score.get(i) >= 55) {
                nDP++;
            }else if (score.get(i) >= 50) {
                nD++;
            }else{
                nF++;
            }
        }
        System.out.printf("Grade: A %d, B+ %d, B %d, C+ %d, C %d, D+ %d, D %d, F %d\n", nA, nBP, nB, nCP, nC, nDP, nD, nF);
    }
    // ใช้ในการหาชื่อของ Class
    public String getCourseName(){
        return this.name;
    }
}
