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

 Date: 20/05/2018 21:57:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_lecture
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_lecture`;
CREATE TABLE `curriculum_lecture`  (
  `lecture_id` bigint(18) NOT NULL COMMENT '讲ID',
  `lecture_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '讲名称（AES加密）',
  `lectrue_state` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '讲状态 0：隐藏 1：显示（AES加密）',
  `lectrue_create_time` datetime(0) NOT NULL COMMENT '讲创建时间',
  PRIMARY KEY (`lecture_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '讲' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
