/*
 Navicat Premium Data Transfer

 Source Server         : docker-mysql
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : StudentManagementSystem

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 28/03/2019 16:58:31
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for ADMIN_LOGIN_INFO
-- ----------------------------
DROP TABLE IF EXISTS `ADMIN_LOGIN_INFO`;
CREATE TABLE `ADMIN_LOGIN_INFO` (
  `a_id` int(11) NOT NULL AUTO_INCREMENT,
  `a_account` varchar(100) COLLATE utf8_bin NOT NULL,
  `a_password` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`a_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of ADMIN_LOGIN_INFO
-- ----------------------------
BEGIN;
INSERT INTO `ADMIN_LOGIN_INFO` VALUES (1, 'admin', '123');
COMMIT;

-- ----------------------------
-- Table structure for CLASS_INFO
-- ----------------------------
DROP TABLE IF EXISTS `CLASS_INFO`;
CREATE TABLE `CLASS_INFO` (
  `class_id` int(11) NOT NULL AUTO_INCREMENT,
  `major_id` int(11) NOT NULL,
  `class_name` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`class_id`),
  KEY `major_id` (`major_id`),
  CONSTRAINT `major_id` FOREIGN KEY (`major_id`) REFERENCES `MAJOR_INFO` (`m_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of CLASS_INFO
-- ----------------------------
BEGIN;
INSERT INTO `CLASS_INFO` VALUES (1, 1, '1501');
INSERT INTO `CLASS_INFO` VALUES (2, 1, '1502');
INSERT INTO `CLASS_INFO` VALUES (3, 2, '1501');
INSERT INTO `CLASS_INFO` VALUES (4, 3, '1601');
INSERT INTO `CLASS_INFO` VALUES (5, 2, '1502');
INSERT INTO `CLASS_INFO` VALUES (6, 3, '1501');
INSERT INTO `CLASS_INFO` VALUES (7, 4, '1501');
INSERT INTO `CLASS_INFO` VALUES (8, 4, '1502');
COMMIT;

-- ----------------------------
-- Table structure for COURSE_INFO
-- ----------------------------
DROP TABLE IF EXISTS `COURSE_INFO`;
CREATE TABLE `COURSE_INFO` (
  `c_id` int(11) NOT NULL AUTO_INCREMENT,
  `c_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `c_type` varchar(20) COLLATE utf8_bin NOT NULL,
  `c_credits` varchar(10) COLLATE utf8_bin NOT NULL,
  `c_teacher` int(11) NOT NULL,
  PRIMARY KEY (`c_id`),
  KEY `teacher_id` (`c_teacher`),
  CONSTRAINT `teacher_id` FOREIGN KEY (`c_teacher`) REFERENCES `TEACHER_INFO` (`t_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of COURSE_INFO
-- ----------------------------
BEGIN;
INSERT INTO `COURSE_INFO` VALUES (1, '高等数学', '基础', '5.0', 1);
INSERT INTO `COURSE_INFO` VALUES (2, '六级英语', '基础', '4.0', 2);
INSERT INTO `COURSE_INFO` VALUES (3, '大学物理', '基础', '3.5', 3);
INSERT INTO `COURSE_INFO` VALUES (4, 'C++基础', '基础', '4.5', 4);
INSERT INTO `COURSE_INFO` VALUES (5, 'Java程序设计', '基础', '3.0', 4);
COMMIT;

-- ----------------------------
-- Table structure for DEPARTMENT_INFO
-- ----------------------------
DROP TABLE IF EXISTS `DEPARTMENT_INFO`;
CREATE TABLE `DEPARTMENT_INFO` (
  `d_id` int(11) NOT NULL AUTO_INCREMENT,
  `d_name` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of DEPARTMENT_INFO
-- ----------------------------
BEGIN;
INSERT INTO `DEPARTMENT_INFO` VALUES (1, '计算机科学与技术学院');
INSERT INTO `DEPARTMENT_INFO` VALUES (2, '数理科学学院');
INSERT INTO `DEPARTMENT_INFO` VALUES (3, '环境工程学院');
INSERT INTO `DEPARTMENT_INFO` VALUES (4, '土木工程学院');
INSERT INTO `DEPARTMENT_INFO` VALUES (5, '材料科学与工程学院');
INSERT INTO `DEPARTMENT_INFO` VALUES (6, '经济与管理学院');
COMMIT;

-- ----------------------------
-- Table structure for MAJOR_INFO
-- ----------------------------
DROP TABLE IF EXISTS `MAJOR_INFO`;
CREATE TABLE `MAJOR_INFO` (
  `m_id` int(11) NOT NULL AUTO_INCREMENT,
  `department_id` int(11) NOT NULL,
  `m_name` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`m_id`),
  KEY `department_id` (`department_id`),
  CONSTRAINT `department_id` FOREIGN KEY (`department_id`) REFERENCES `DEPARTMENT_INFO` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of MAJOR_INFO
-- ----------------------------
BEGIN;
INSERT INTO `MAJOR_INFO` VALUES (1, 1, '计算机科学与技术');
INSERT INTO `MAJOR_INFO` VALUES (2, 1, '电子信息技术');
INSERT INTO `MAJOR_INFO` VALUES (3, 2, '信息与计算科学');
INSERT INTO `MAJOR_INFO` VALUES (4, 2, '应用数学');
INSERT INTO `MAJOR_INFO` VALUES (5, 3, '环境工程');
INSERT INTO `MAJOR_INFO` VALUES (6, 4, '混凝土工程');
INSERT INTO `MAJOR_INFO` VALUES (7, 5, '新材料工程');
INSERT INTO `MAJOR_INFO` VALUES (8, 6, '工商管理');
COMMIT;

-- ----------------------------
-- Table structure for STUDENT_INFO
-- ----------------------------
DROP TABLE IF EXISTS `STUDENT_INFO`;
CREATE TABLE `STUDENT_INFO` (
  `s_id` int(11) NOT NULL AUTO_INCREMENT,
  `s_classid` int(11) NOT NULL,
  `s_recordid` int(11) NOT NULL,
  `s_departmentid` int(11) NOT NULL,
  `s_majorid` int(11) NOT NULL,
  `s_grade` varchar(100) COLLATE utf8_bin NOT NULL,
  `s_account` varchar(100) COLLATE utf8_bin NOT NULL,
  `s_idnum` varchar(50) COLLATE utf8_bin NOT NULL,
  `s_sex` varchar(10) COLLATE utf8_bin NOT NULL,
  `s_nation` varchar(30) COLLATE utf8_bin NOT NULL DEFAULT '汉族',
  `s_addr` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `s_phone` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `s_origin` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `s_graduate_date` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `s_enroll_date` varchar(50) COLLATE utf8_bin DEFAULT NULL,
  `s_degree` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  KEY `s_account` (`s_account`),
  KEY `class_id` (`s_classid`),
  KEY `m_id` (`s_majorid`),
  KEY `r_id` (`s_recordid`),
  KEY `d_id` (`s_departmentid`),
  CONSTRAINT `class_id` FOREIGN KEY (`s_classid`) REFERENCES `CLASS_INFO` (`class_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `d_id` FOREIGN KEY (`s_departmentid`) REFERENCES `DEPARTMENT_INFO` (`d_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `m_id` FOREIGN KEY (`s_majorid`) REFERENCES `MAJOR_INFO` (`m_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `r_id` FOREIGN KEY (`s_recordid`) REFERENCES `STUDENT_RECORDS_INFO` (`r_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of STUDENT_INFO
-- ----------------------------
BEGIN;
INSERT INTO `STUDENT_INFO` VALUES (1, 1, 1, 1, 1, '大学一年级', '150101', '320123199705323435', '男', '汉族', NULL, NULL, '江苏省南京市', NULL, '2015', NULL);
COMMIT;

-- ----------------------------
-- Table structure for STUDENT_LOGIN_INFO
-- ----------------------------
DROP TABLE IF EXISTS `STUDENT_LOGIN_INFO`;
CREATE TABLE `STUDENT_LOGIN_INFO` (
  `u_id` int(11) NOT NULL AUTO_INCREMENT,
  `u_account` varchar(100) COLLATE utf8_bin NOT NULL,
  `u_password` varchar(100) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`u_id`),
  KEY `user_account` (`u_account`),
  CONSTRAINT `user_account` FOREIGN KEY (`u_account`) REFERENCES `STUDENT_INFO` (`s_account`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of STUDENT_LOGIN_INFO
-- ----------------------------
BEGIN;
INSERT INTO `STUDENT_LOGIN_INFO` VALUES (4, '150101', '123');
COMMIT;

-- ----------------------------
-- Table structure for STUDENT_RECORDS_INFO
-- ----------------------------
DROP TABLE IF EXISTS `STUDENT_RECORDS_INFO`;
CREATE TABLE `STUDENT_RECORDS_INFO` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `r_status` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of STUDENT_RECORDS_INFO
-- ----------------------------
BEGIN;
INSERT INTO `STUDENT_RECORDS_INFO` VALUES (1, '正常');
INSERT INTO `STUDENT_RECORDS_INFO` VALUES (2, '正常');
INSERT INTO `STUDENT_RECORDS_INFO` VALUES (3, '正常');
INSERT INTO `STUDENT_RECORDS_INFO` VALUES (4, '正常');
INSERT INTO `STUDENT_RECORDS_INFO` VALUES (5, '正常');
COMMIT;

-- ----------------------------
-- Table structure for STUDENT_SCORE_INFO
-- ----------------------------
DROP TABLE IF EXISTS `STUDENT_SCORE_INFO`;
CREATE TABLE `STUDENT_SCORE_INFO` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `s_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL,
  `score` varchar(10) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`id`),
  KEY `s_id` (`s_id`),
  CONSTRAINT `s_id` FOREIGN KEY (`s_id`) REFERENCES `STUDENT_INFO` (`s_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Table structure for TEACHER_INFO
-- ----------------------------
DROP TABLE IF EXISTS `TEACHER_INFO`;
CREATE TABLE `TEACHER_INFO` (
  `t_id` int(11) NOT NULL AUTO_INCREMENT,
  `t_name` varchar(100) COLLATE utf8_bin NOT NULL,
  `t_phone` varchar(20) COLLATE utf8_bin NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of TEACHER_INFO
-- ----------------------------
BEGIN;
INSERT INTO `TEACHER_INFO` VALUES (1, '张三丰', '18751823433');
INSERT INTO `TEACHER_INFO` VALUES (2, '李四光', '18759373332');
INSERT INTO `TEACHER_INFO` VALUES (3, '赵明光', '187538327332');
INSERT INTO `TEACHER_INFO` VALUES (4, '刘祁隆', '15833727261');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
