Main.class: Main.java Trainee.class Trainer.class Workout.class Abs.class PullUp.class Squats.class Person.class Address.class
	javac -g Main.java
Person.clas: Person.java Trainee.class Trainer.class Address.class
	javc -g Person.java
Adress.class: Address.java
	javac -g Address.java
Trainee.class: Trainee.java Workout.class Person.java 
	javac -g Trainee.java
Trainer.class: Trainer.java Workout.class Trainee.class Person.java
	javac -g Trainer.java
Workout.class: Workout.java PullUp.class Abs.class Squats.class
	javac -g Workout.java
Abs.class: Abs.java Workout.class
	javac -g Abs.java
Squats.class: Squats.java Workout.class
	javac -g Squats.java
PullUp.class: PullUp.java Workout.class
	javac -g PullUp.java
clean:
	rm *.class
run:	Main.class
	java Main
update:
	jar uf petjar.jar *

runjar: petjar.jar
	java -jar  petjar.jar

debug:
