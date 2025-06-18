package rough_space;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RoughSpace5 {
	
	public static void main(String[] args) 
	{
		List l = new ArrayList(Arrays.asList("NL","CN","AG","CL","CO","AR","SX","VI","PA","UY","PR","MX","BM","USA","VG","AU","NZ","BR","CA"));
		
		String strArr[] = {"NL","CN","AG","CL","CO","AR","SX","VI","PA","UY","PR","MX","BM","USA","VG","AU","NZ","BR","CA"};
		
		String str = "INSERT INTO CUSTOM_CODES_DTL_MASTER (whse_id, app_id, code_key1, code_key2, code_key3, code_type, code_id, locale_id, code_desc, value1, value2, filter1, filter2, filter3, sort_seqno, ref_field1, ref_field2, ref_field3, ref_field4, ref_field5, active_flag, modify_user, modify_tstamp, create_user, create_tstamp) " ;
		String str1= "  VALUES('CRN', 'WMS', ' ', ' ', ' ', 'SHIPTO_COUNTRY_CD', $$1, 'en', 'Ship To Country Code Request', 0, 0, ' ', ' ', ' ', 5, ' ', ' ', ' ', ' ', ' ', 'Y', 'SFTADMIN', To_Timestamp_TZ('15.10.2024 06:04:57.272 Canada/Atlantic', 'dd.mm.yyyy hh24:mi:ss.ff3 tzr'), 'SFTADMIN', To_Timestamp_TZ('15.10.2024 06:04:57.272 Canada/Atlantic', 'dd.mm.yyyy hh24:mi:ss.ff3 tzr')); "
;
		String s1 = "";
		
		
		
		for(int i= 0; i< strArr.length; i++)
		{
			s1 = str1.replace("$$1", "'"+strArr[i]+"'");
			System.out.println(str);
			System.out.println(s1);
			System.out.println("");
		}
	}
}
