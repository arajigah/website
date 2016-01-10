INSERT INTO vendor (name) VALUES ('Vick''s Veggies');
INSERT INTO vendor (name) VALUES ('Mel''s Meats');
INSERT INTO vendor (name) VALUES ('Freddy''s Fruits');
INSERT INTO foodcategory (category) VALUES ('Vegetable');
INSERT INTO foodcategory (category) VALUES ('Fruit');
INSERT INTO foodcategory (category) VALUES ('Meat');
INSERT INTO foodcategory (category) VALUES ('Fish');
INSERT INTO enclosurecondition (condition) VALUES ('Clean');
INSERT INTO enclosurecondition (condition) VALUES ('Untidy');
INSERT INTO enclosurecondition (condition) VALUES ('Dirty');

INSERT INTO food (name, foodcategory_id, vendor_id) VALUES ('bananas', 2, 3);
INSERT INTO food (name, foodcategory_id, vendor_id) VALUES ('salmon', 4, 2);
INSERT INTO food (name, foodcategory_id, vendor_id) VALUES ('lettuce', 1, 1);
INSERT INTO food (name, foodcategory_id, vendor_id) VALUES ('beef', 3, 2);
INSERT INTO animal (infoLink, name, sciname, food_id) VALUES ('https://en.wikipedia.org/wiki/Grizzly_bear', 'Grizzly Bear', 'Ursus arctos horribilis', 2);
INSERT INTO animal (infoLink, name, sciname, food_id) VALUES ('https://en.wikipedia.org/wiki/Chimpanzee', 'Chimpanzee', 'Pan', 1);
INSERT INTO enclosure (feedtime, name, numofanimals, animal_id, enclosurecondition_id) VALUES ('1400', 'Grizzly Bear Enclosure', 3, 1, 2);
INSERT INTO enclosure (feedtime, name, numofanimals, animal_id, enclosurecondition_id) VALUES ('1000', 'Chimpanzee Enclosure', 4, 2, 3);
