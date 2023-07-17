Feature: Addition and Edit Project
  Scenario Outline: Project Checking
    Given Enter the Website
    When Input '<UserID>' and '<Password>' and log in
    And check out the Project list
    And Click on add project
    And Input Title '<Bangla>' and '<English>' and '<Description>' and submit
    And  Check list
    And Click on SearchBar and input '<English>'
    And Click on Edit
    And Click on '<Descriptions>' and input something and Submit
    Then Go to check list

    Examples:
      |UserID|Password|Bangla|English|Description|Descriptions|
      |titu.admin|sa  |কানাডা|Canada |USA|United State Of America|