# Goal
To make a gym program, prove what have been learning through the semester.

## Input
This program has an optional input, as the 'filename'. If the input is not passed, then the files are 'workoutFile.txt' and 'traineeFile.txt' will be used as default file. The file must be in txt format. If the input file does not exist, then the program uses sample data, which is hardcoded into the program.
 
This program opens the file indicated in 'filename' and fills in the user input from the main menu which contain either signup or sign in methods and save the information to the file
The format of the trainee and workout is as follows:
user basic information such as name, address, phone, and email. workout file that gonna be updated from the trainer side.

## Output
The program prompts the user to sing up or sing in 
there will be a specific sing up for the trainer otherwise it just a regular user.
If the account is Trainer, then the trainer menu shows.
If the account is a Trainee, then the trainee menu shows.

Also, before the exiting the program the changes will be saved in those files.

## Steps
If an argument is passed, then use it as the DB path, otherwise, use 'traineeFile.txt' as the DB path. DB is a text file in txt format.

### Read database
If the DB file does not exist, fill the accounts with the sample hardcoded data.
If the DB file does exist, then fill the trainee data and the update that might apply in the workout file.

### Login
Show the Login menu.
Get the account number and PIN from the user
Compare the account number and PIN against all accounts.
If the account does not exist or PIN is wrong, try again.
Otherwise, get that account.

### Menu
If the account is trainer, then show trainer menu.
If the account is Trainee, then show trainee menu.
if the user cilck on a sign up then get his/her information and svae it to the file
