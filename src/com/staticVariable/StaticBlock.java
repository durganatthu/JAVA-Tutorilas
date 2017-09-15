package com.staticVariable;

// Sttaic Block Example

public class StaticBlock {
	
		private static int reward;
		static{
			reward = 10;
		}
		public static void main(String args[])
		{
			System.out.println("Reward Point = "+StaticBlock.reward);
		}
	}

