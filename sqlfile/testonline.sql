SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for exam
-- ----------------------------
DROP TABLE IF EXISTS `exam`;
CREATE TABLE `exam` (
  `exam_id` int(100) NOT NULL,
  `sub_id` int(100) NOT NULL,
  `ques_id` int(100) NOT NULL,
  PRIMARY KEY (`exam_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question` (
  `ques_id` int(20) NOT NULL,
  `type_id` int(20) DEFAULT NULL,
  `title` varchar(1000) DEFAULT NULL,
  `quespic` varchar(100) DEFAULT NULL,
  `score` double(10,0) DEFAULT NULL,
  `ansA` varchar(50) DEFAULT NULL,
  `ansB` varchar(50) DEFAULT NULL,
  `ansC` varchar(50) DEFAULT NULL,
  `ansD` varchar(50) DEFAULT NULL,
  `ansE` varchar(50) DEFAULT NULL,
  `answer` varbinary(500) DEFAULT NULL,
  `choanswer` int(100) DEFAULT NULL,
  PRIMARY KEY (`ques_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for result
-- ----------------------------
DROP TABLE IF EXISTS `result`;
CREATE TABLE `result` (
  `res_id` int(10) NOT NULL,
  `score` double(20,0) DEFAULT NULL,
  `restime` date DEFAULT NULL,
  `sub_id` int(10) DEFAULT NULL,
  `u_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`res_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(10) NOT NULL,
  `rolename` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject` (
  `sub_id` int(10) NOT NULL,
  `subname` varchar(20) DEFAULT NULL,
  `subtime` date DEFAULT NULL,
  PRIMARY KEY (`sub_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type` (
  `type_id` int(10) NOT NULL,
  `typename` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `u_id` int(10) NOT NULL,
  `uname` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role_id` int(10) DEFAULT NULL,
  PRIMARY KEY (`u_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user_sub
-- ----------------------------
DROP TABLE IF EXISTS `user_sub`;
CREATE TABLE `user_sub` (
  `u_id` int(10) NOT NULL,
  `sub_id` int(10) NOT NULL,
  `status` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

SET FOREIGN_KEY_CHECKS = 1;
