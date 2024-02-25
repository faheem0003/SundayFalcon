package com.upskill.java_5;

public interface Interface {

		public abstract void iDoor();
		public abstract int iWheel();
		public abstract String iEngine();

}

/*
(Parent)			(Keyword) 			(Child)			 (Keyword) 			(GrandChild)	
				
Class	             extends		     class
Abstract Class (+3)	 extends             class(3-3=0)    interface(+3)		 implements          class
Interface(+3)		 extends             interface       implements            class


*/