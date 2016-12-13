CREATE TABLE `department` (
  `deptNo` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`deptNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE `employee` (
  `empno` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `hireday` datetime DEFAULT NULL,
  `salary` double DEFAULT NULL,
  `deptNo` int(11) DEFAULT NULL,
  PRIMARY KEY (`empno`),
  KEY `deptNo_idx` (`deptNo`),
  CONSTRAINT `deptNo` FOREIGN KEY (`deptNo`) REFERENCES `department` (`deptNo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
