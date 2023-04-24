#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char name[50];
    int score;
} student_t;

int main() {
    int num_students;
    printf("Enter the number of students: ");
    scanf("%d", &num_students);
    student_t* students = (student_t*) malloc(num_students * sizeof(student_t));
    if (students == NULL) {
        printf("Memory allocation error");
        return -1;
    }

    int total_score = 0;
    for (int i = 0; i < num_students; i++) {
        printf("Enter the name and score for student %d: ", i+1);
        scanf("%s %d", students[i].name, &students[i].score);
        total_score += students[i].score;
    }
    
    if (total_score < 0 || total_score > 1000000) {
        printf("Invalid total score\n");
        return -1;
    }
    printf("Total score: %d\n", total_score);

    char subject[10];
    printf("Enter the subject: ");
    scanf("%9s", subject); 
    printf("Subject: %s\n", subject);

    char course_name[20];
    printf("Enter the name of the course: ");
    scanf("%19s", course_name); 
    printf("Course name: %s\n", course_name);

    char command[50];
    printf("Enter the name of the command to run: ");
    scanf("%49s", command); 
    printf("Running the command: ls\n");
    system("ls");

    
    char filename[20];
    printf("Enter the name of the file to write: ");
    scanf("%19s", filename); 
    FILE* fp;
    fp = fopen(filename, "w");
    if (fp == NULL) {
        printf("File open error");
        return -1;
    }
    
    for (int i = 0; i < num_students; i++) {
        fprintf(fp, "%s %d\n", students[i].name, students[i].score);
    }
    fclose(fp);

    free(students);
    return 0;
}
