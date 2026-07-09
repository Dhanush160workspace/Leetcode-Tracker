-- Last updated: 7/9/2026, 3:10:25 PM
select max(salary) as SecondHighestSalary
from employee
where salary < (select max(salary) from employee);