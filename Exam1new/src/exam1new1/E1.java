package exam1new1;

public class E1 {

		    public static void main( String[] args )
		    {
		        int h = 0;
		        int[] s = new int[100];
		        for (int i = 101; i < 201; i++) {
					for (int j = 2; j < i/2+1; j++) {
						if (i%j == 0){
							s[h]=i;
							h++;
							break;
						}
					}
				}
		        System.out.print("����������Ϊ"+h+"�������ǣ�");
		        for (int i = 0; i < h; i++) {
		            System.out.print(s[i]+"��");
				}
		    }
		}


	


