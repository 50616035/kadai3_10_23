package combination;


	public class Combination_lib {
		private int s,r,n;
		public Combination_lib(int s,int r,int n) {
			this.s = s;
			this.r = r;
			this.n = s-r;
		}
		
		public int getFactorical() {//s‚ÌŠKæ
			int f=1 ;

			for (; this.s >= 1;){
				f=f*this.s;
				this.s--;
			}
			this.s = f; 
			f = 1;
			for (; this.r >= 1;){
				f=f*this.r;
				this.r--;
			}
			this.r = f;
			f = 1;
			for (; this.n >= 1;){
				f=f*this.n;
				this.n--;
			}
			this.n = f;
		    f=this.s/(this.r*this.n);
			return f;
			}
	}