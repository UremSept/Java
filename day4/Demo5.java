package day4;

public class Demo5 {

	/**
	 * ц╟ещеепР
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score={55,89,65,97,32};
		for(int i=0;i<score.length-1;i++){
			for(int j=0;j<score.length-1-i;j++){
				if(score[j]>score[j+1]){
					int temp=score[j];
					score[j]=score[j+1];
					score[j+1]=temp;
				}
				
			}
		}
		for(int m=0;m<score.length;m++)
		System.out.println(score[m]);

	}

}
