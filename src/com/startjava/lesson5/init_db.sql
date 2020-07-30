CREATE TABLE jaegers (
 	id serial primary key,
 	modelName text,
  	mark char(6),
 	height decimal,
 	weight integer,
 	status text,
 	origin text,
 	launch date,
 	kaijuKill int
);

ALTER TABLE jaegers ALTER COLUMN height TYPE decimal;

INSERT INTO jaegers (modelName, mark, height, weight, status, origin, launch, kaijuKill)
	VALUES
		('Brawler Yukon', 'Mark-1', '60', '2500', 'Destroyed', 'United States of America', '30.01.2015', '2'),
		('Gipsy Danger', 'Mark-3', '79.25', '1980', 'Destroyed', 'United States of America', '10.07.2017', '9'),
		('Saber Athena', 'Mark-7', '76.91', '1630', 'Destroyed', 'China', '20.12.2033', '1'),
		('Gipsy Avenger', 'Mark-6', '81.77', '2004', 'Destroyed', 'Russian Federation', '12.01.2034', '1'),
		('Guardian Bravo', 'Mark-6', '73.21', '1975', 'Active', 'United States of America', '15.12.2033', '0'),
		('Crimson Typhoon', 'Mark-4', '76.2', '1722', 'Destroyed', 'China', '22.08.2018', '7'),
		('Bracer Phoenix', 'Mark-5', '70.91', '2128', 'Destroyed', 'United States of America', '01.11.2025', '0'),
		('Romeo Blue', 'Mark-1', '77.72', '7775', 'Destroyed', 'United States of America', '15.12.2015', '2'),
		('Coyote Tango', 'Mark-1', '85.34', '2312', 'Destroyed', 'United States of America', '30.12.2015', '2'),
		('Tacit Ronin', 'Mark-1', '74.37', '7450', 'Destroyed', 'Japan', '06.12.2015', '3');



