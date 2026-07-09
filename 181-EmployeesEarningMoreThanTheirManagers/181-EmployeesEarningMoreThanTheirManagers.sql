-- Last updated: 7/9/2026, 3:10:19 PM
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
    ON e.managerId = m.id
WHERE e.salary > m.salary;