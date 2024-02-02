package work;
import java.util.Map;
import java.util.HashMap;

public class Q8x17 {
        public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>(){{ 
            put("'国語'", 75);
            put("'算数'", 80);
        }};
        
        // １
        System.out.print("[");
        for (String key: map.keySet()) {
            System.out.print(key + "：" + map.get(key));
            
            }
        
        

        for (String key: map.keySet()) {
            System.out.println(key + "：" + map.get(key));
            }

    }
}



// import java.util.List;
// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

// class Sample8_17 {
//     public static void main(String[] args){

//         /* # 科目名と得点を連想配列に格納し表示 */

//         /* # 連想配列を作成しListに格納 */
//         List<HashMap> subjects_score_array = new ArrayList<HashMap>();
//         subjects_score_array.add(
//             new HashMap<String, Integer>() {
//                 {put("国語" , 75); put("算数" , 80);}
//             }
//         );

//         subjects_score_array.add(
//             new HashMap<String, Integer>() {
//                 {put("国語" , 75); put("数学" , 80);}
//             }
//         );

//         subjects_score_array.add(
//             new HashMap<String, Integer>() {
//                 {put("国語" , 75); put("数学" , 80); put("理科", 65);
//                  put("社会" , 90); put("英語" , 70);}
//             }
//         );

//         for ( HashMap<String, Integer> subjects_score : subjects_score_array){
//             System.out.println(subjects_score.toString());
//         }
//     }
// }
