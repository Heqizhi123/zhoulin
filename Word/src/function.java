import java.awt.Graphics;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.io.IOException;
public class function { 
	static Scanner in = new Scanner(System.in);
	Map<String,Integer> Map = new LinkedHashMap<String, Integer>(); 
    //��ʾ��Ƶ����״ͼ
    void fund(Map<String, Integer> map){
        System.out.println("��������Ҫ��ѯ�ĵ��� :");
        String string = in.nextLine();
        String[] word= string.split(",");
        float sum;
        for(int i=0; i<word.length; i++) {
        	for(Map.Entry<String,Integer> w : map.entrySet()) { 
        		if(word[i].equals(w.getKey()))
        		{  
        			System.out.println("����"+w.getKey() + "����" + w.getValue()+"��");
        			sum=(float)(w.getValue())/500; 
        			for(int j=0;j<sum;j++){
        				System.out.print("��");
        			}
        			System.out.println();
        		}  
            } 
        }
    }
    //���� 
    void sort(Map<String, Integer> map) {  
       Set<Entry<String,Integer>> m= map.entrySet();   
       LinkedList<Entry<String, Integer>> List = new LinkedList<Entry<String,Integer>>(m);  
       Collections.sort(List, new Comparator<Entry<String,Integer>>() {  
           public int compare(Entry<String, Integer> a,  Entry<String, Integer> b) {  
               return b.getValue().compareTo(a.getValue());  
           }  
       });   
       for(Entry<String,Integer> entry: List) {  
           Map.put(entry.getKey(), entry.getValue());  
       }  
   } 
  //���ǰn������
     void print(Map<String, Integer> map) {  
    	sort(map);
        System.out.println("������鿴���ʸ�����");
        int n = in.nextInt();
        for(Entry<String,Integer> w : Map.entrySet()) {  
            System.out.println("����"+w.getKey() + "����" + w.getValue()+"��");  
            n--;
            if(n<=0)	
            	break;
        } 
       
    }  
    //����д��result.txt
     void Sort(Map<String, Integer> map)throws IOException {  
    	sort(map);
        File file = new File("result.txt");
        FileWriter f = new FileWriter(file.getAbsoluteFile());
        for(Entry<String,Integer> w: Map.entrySet()) {
        	f.write(w.getKey() + "/" + w.getValue()+"     ");
        }
        f.close();
        System.out.println("������");
    }  
}