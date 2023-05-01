package rsa;
import java.math.BigInteger;
public class RSA {
	public static void main(String[] args) {
		int p=6569;
		int q=8089;
		int n;
		int phi;
		int e=11;
		int ci=28901722;
		n=p*q;
		phi=(p-1)*(q-1);
		BigInteger N=BigInteger.valueOf(n);
		BigInteger PHI=BigInteger.valueOf(phi);
		BigInteger E=BigInteger.valueOf(e);
		BigInteger CI=BigInteger.valueOf(ci);
		BigInteger D=E.modInverse(PHI);
		BigInteger PL=CI.modPow(D, N);
		System.out.println("The plain text for cipher text "+CI+" is "+PL); 
		}

		}

