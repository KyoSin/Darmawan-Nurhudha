students = LOAD 'C:/Users/100e/Documents/Darmawan Nurhudha/GitHub/Darmawan-Nurhudha/Praktikum BigData/Week 4/Pig.txt' USING PigStorage(',') AS (name:chararray, age:int, gpa:float);
filtered_students = FILTER students BY gpa > 3.0;
grouped_by_age = GROUP filtered_students BY age;
DUMP grouped_by_age;
STORE grouped_by_age INTO 'C:/Users/100e/Documents/ouput' USING PigStorage(',');