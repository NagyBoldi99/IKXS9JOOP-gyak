package myPckage.second;

import myPackage.first.Number;

public class feladat {

	public static void main(String[] args) {
		final Number num=new Number(Math.random());
		int cnt=1;
		while(!num.isEqual(Math.random()))
		{
			cnt++;
		}
		System.out.println("Matched " + num + " in " + cnt + " tries.");
		
		num.setNum(0.1);
        cnt = 1;
        while (!num.isEqual(Math.random())) {
            cnt++;
        }
        System.out.println("Matched " + num + " in " + cnt + " tries.");
    }
	
}
