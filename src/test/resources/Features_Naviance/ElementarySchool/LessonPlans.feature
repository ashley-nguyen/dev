Feature: Naviance Elementary School
  in order to review the Elementary Lesson Plans
  as a Naviance user  I want to login to Naviance Elementary School

  Background:
    Given I am logged into Naviance "blue2es" as "automation.admin" with "password"

  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade K
    When I navigate to View All Lesson Plans and select grade "Grade K"
    Then The lesson plans should be similar to the table:
      |Title                     |Objective                                                                                                                                       |Grade|Theme                     |Duration     |
      |Different Kinds of Schools|Understand that students take classes in elementary school, middle school, high school, and college.                                            |K    |School and Courses        |55-60 minutes|
      |Dream Jobs                |Understand that people can have jobs doing things they like to do.                                                                              |K    |Career Exploration        |50-55 minutes|
      |Dream On!                 |Understand that everyone dreams about things they want to do in life.                                                                           |K    |Planning and Possibilities|55-60 minutes|
      |Money, Money, Money       |Understand that people pay for things with money.                                                                                               |K    |Affordability             |50-55 minutes|
      |What Am I Good at Doing?  |Understand that all people have a skill they can do well.                                                                                       |K    |Self Knowledge            |50-55 minutes|
      |What Is College?          |Understand that college is a school people can go to after high school, and that people in college study and learn more to get ready for a job. |K    |College Exploration       |50-55 minutes|

  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade 1
    When I navigate to View All Lesson Plans and select grade "Grade 1"
    Then The lesson plans should be similar to the table:
      |Title                                           |Objective                                                                                             |Grade|Theme                      |Duration     |
      |Everybody Loves to Learn                        |Understand that favorite subjects in school can help people choose a job.                             |1    |School and Courses         |55-60 minutes|
      |Let's Go Shopping                               |Understand that people use money to pay for things they need to live and to pay for things they want. |1    |Affordability              |55-60 minutes|
      |My Big Plan                                     |Understand that people make plans for achieving their goals.                                          |1    |Planning and Possibilities |55-60 minutes|
      |Our School Works Together                       |Understand some of the different jobs people have in a school.                                        |1    |Career Exploration         |55-60 minutes|
      |So Many Colleges, So Many Possibilities Part I  |Understand that people go to college to prepare for different jobs.                                   |1    |College Exploration        |55-60 minutes|
      |So Many Colleges, So Many Possibilities Part II |Understand that people go to college to prepare for different jobs.                                   |1    |College Exploration        |55-60 minutes|
      |Teamwork Is Awesome                             |Understand that people can work in groups to help each other do great things.                         |1    |Self Knowledge             |55-60 minutes|

  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade 2
    When I navigate to View All Lesson Plans and select grade "Grade 2"
    Then The lesson plans should be similar to the table:
      |Title                             |Objective                                                                                                                                 |Grade|Theme                     |Duration     |
      |College Trivia Part I             |Understand that jobs require different degrees, and that there are many colleges a person can attend to get the type of degree they want. |2    |College Exploration       |55-60 minutes|
      |College Trivia Part II            |Understand that jobs require different degrees, and that there are many colleges a person can attend to get the type of degree they want. |2    |College Exploration       |50-55 minutes|
      |Let's Make a Goal!                |Understand the difference between a short-term goal and a long-term goal, and how breaking up goals makes achieving big things easier.    |2    |Planning and Possibilities|50-55 minutes|
      |Make Your Mark                    |Understand that a positive mindset and hard work are important for success in school and life.                                            |2    |Self Knowledge            |55-60 minutes|
      |Smart Spending, Smart Saving      |Understand that adults make budgets and that making a budget can help you plan a way to save money for college.                           |2    |Affordability             |50-60 minutes|
      |Try, Try Again                    |Understand that mistakes are a part of learning and working hard, and putting in effort will help you do well in school and life.         |2    |School and Courses        |50-60 minutes|
      |What Do People Do All Day? Part I |Understand that people can choose careers based on what they are good at and what they like to do.                                        |2    |Career Exploration        |50-60 minutes|
      |What Do People Do All Day? Part II|Understand that people can choose careers based on what they are good at and what they like to do.                                        |2    |Career Exploration        |50-60 minutes|


  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade 3
    When I navigate to View All Lesson Plans and select grade "Grade 3"
    Then The lesson plans should be similar to the table:
      |Title                      |Objective                                                                                                                                       |Grade|Theme                     |Duration     |
      |Am I There Yet?            |Understand that change is a part of growth, and a person’s likes and dreams can change over time.                                               |3    |Self Knowledge            |50-55 minutes|
      |How Will I Pay for College?|Understand that different degrees and colleges cost different amounts of money, and there are many ways to pay for college.                     |3    |Affordability             |50-55 minutes|
      |I Am Me                    |Understand that each person is unique and has their own path to follow in life.                                                                 |3    |Career Exploration        |50-55 minutes|
      |My Dream College Part I    |Understand the different school options available after high school and how personal preferences help people choose a school after high school. |3    |College Exploration       |50-55 minutes|
      |My Dream College Part II   |Understand the different school options available after high school and how personal preferences help people choose a school after high school. |3    |College Exploration       |50-55 minutes|
      |Story of My Future Self    |Understand that there are always new problems to solve, and that new jobs are created every year as a result.                                   |3    |Career Exploration        |50-55 minutes|
      |What Job Am I?             |Understand that jobs relate to school subjects and how jobs fall into career clusters.                                                          |3    |School and Courses        |55-60 minutes|

  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade 4
    When I navigate to View All Lesson Plans and select grade "Grade 4"
    Then The lesson plans should be similar to the table:
      |Title                                     |Objective                                                                                                                                                             |Grade|Theme                     |Duration     |
      |Career Planning                           |Understand how different skills and education impact jobs and career possibilities.                                                                                   |4    |School and Courses        |55-60 minutes|
      |Finding My Dream College                  |Understand how going to college helps people achieve their dreams and why people choose certain colleges over others.                                                 |4    |College Exploration       |55-60 minutes|
      |Goals Are a Work in Progress Part I       |Demonstrate how to revisit and revise goals that have been set and understand that making changes to goals can help people adjust their plan for achieving the goals. |4    |Planning and Possibilities|55-60 minutes|
      |Goals Are a Work in Progress Part II      |Demonstrate how to revisit and revise goals that have been set and understand that making changes to goals can help people adjust their plan for achieving the goals. |4    |Planning and Possibilities|55-60 minutes|
      |How to Do Well in My Chosen Career Part I |Understand how training and college affect success in a career.                                                                                                       |4    |Career Exploration        |55-60 minutes|
      |One Word to Describe Me                   |Understand how personal strengths and assets relate to well-matched jobs, colleges, and other career possibilities.                                                   |4    |Self Knowledge            |55-60 minutes|
      |Who Can Afford College? I Can!            |Understand that there are many ways to pay for college.                                                                                                               |4    |Affordability             |55-60 minutes|

  @ElementaryLessonsPlans
  Scenario: Review Lesson Plan data in View All Lesson Plans page for Grade 5
    When I navigate to View All Lesson Plans and select grade "Grade 5"
    Then The lesson plans should be similar to the table:
      |Title                            |Objective                                                                                                                                      |Grade|Theme              |Duration     |
      |A Guide to Your Dream Career     |Understand how classes in middle school, high school, and post-secondary education relate to different careers.                                |5    |School and Courses |55-60 minutes|
      |Explore Your Limitless Options   |Understand that dreams can change and that change in interests, beliefs, and attitudes is a part of growth.                                    |5    |Career Exploration |50-55 minutes|
      |The Magic Formula                |Understand why certain colleges might be a good fit for people based on their goals, strengths, interests, attitudes, values, and beliefs.     |5    |College Exploration|50-55 minutes|
      |The Value of Going to College    |Understand that going to college will impact income later in life and may open up new possibilities in the future.                             |5    |Affordability      |55-60 minutes|
      |Where Will You Go to College?    |Understand why certain colleges might be a better fit for students based on their learning styles.                                             |5    |College Exploration|55-60 minutes|