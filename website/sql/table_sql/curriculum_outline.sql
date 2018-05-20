/*
 Navicat MySQL Data Transfer

 Source Server         : sureface
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : officialwebsite

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 20/05/2018 21:57:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_outline
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_outline`;
CREATE TABLE `curriculum_outline`  (
  `outline_id` bigint(18) NOT NULL COMMENT '大纲ID',
  `outline_lecture_id` bigint(18) NOT NULL COMMENT '讲ID',
  `outline_execute_date` date NOT NULL COMMENT '上课日期',
  `outline_execute_time` time(0) NOT NULL COMMENT '上课时间',
  `outline_create_time` datetime(0) NOT NULL COMMENT '大纲创建时间',
  `outline_study_state` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '学习状态 0：未开始 1：正在进行 2：已结束（AES加密）',
  PRIMARY KEY (`outline_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '课程大纲' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
