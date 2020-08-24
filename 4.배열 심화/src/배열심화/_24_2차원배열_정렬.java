package ¹è¿­½ÉÈ­;
/*
 * # 2Â÷¿ø¹è¿­[Á¤·Ä]
 * ¿µÈñ : °¨
 * ¿µÈñ : ±è¹ä
 * ¿µÈñ : »ç°ú
 * Ã¶¼ö : ±è¹ä
 * Ã¶¼ö : »ç°ú
 */
public class _24_2Â÷¿ø¹è¿­_Á¤·Ä {

	public static void main(String[] args) {
		
		int jangCount = 5;
		String[][] jang = {
			{"Ã¶¼ö", "±è¹ä"},
			{"¿µÈñ", "°¨"},
			{"Ã¶¼ö", "»ç°ú"},
			{"¿µÈñ", "»ç°ú"},
			{"¿µÈñ", "±è¹ä"}
		};
		//1¿­ Á¤·Ä (Ã¶¼ö, ¿µÈñ)
		for(int i=0; i<jang.length; i++) {
			String max = jang[i][0];
			int max_index = i;
			for(int j=i; j<jang.length; j++) {
				if(max.compareTo(jang[j][0]) > 0) {
					max = jang[j][0];
					max_index = j;
				}
			}
			
			String[] temp = jang[i];
			jang[i] = jang[max_index];
			jang[max_index] = temp;
		}
		
		//2¿­ Á¤·Ä(»ç°ú, °¨, ±è¹ä)
		for(int i=0; i<jang.length; i++) {
			String max = jang[i][1];
			int max_index = i;
			for(int j=i; j<jang.length; j++) {
				if(jang[i][0].equals(jang[j][0])) {
					if(max.compareTo(jang[j][1]) > 0) {
						max = jang[j][1];
						max_index = j;
					}
				}
			}
			String[] temp = jang[i];
			jang[i] = jang[max_index];
			jang[max_index] = temp;
		}
		
		for(int i=0; i<jang.length; i++) {
			System.out.println(jang[i][0] + " : " + jang[i][1]);
		}
	}
}
