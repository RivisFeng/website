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

 Date: 20/05/2018 21:58:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade`  (
  `grade_id` bigint(18) NOT NULL COMMENT '年级ID',
  `grade_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '年级名字（AES加密）',
  `grade_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '年级状态（AES加密）',
  `grade_create_time` datetime(0) NOT NULL COMMENT '年级创建时间',
  PRIMARY KEY (`grade_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '年级' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
