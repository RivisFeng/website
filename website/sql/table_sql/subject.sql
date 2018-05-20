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

 Date: 20/05/2018 21:58:42
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for subject
-- ----------------------------
DROP TABLE IF EXISTS `subject`;
CREATE TABLE `subject`  (
  `subject_id` bigint(18) NOT NULL COMMENT '科目ID',
  `subject_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '科目名字（AES加密）',
  `subject_create_time` datetime(0) DEFAULT NULL COMMENT '科目创建时间',
  `subject_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '科目状态 0：禁用 1：启用（AES加密）',
  PRIMARY KEY (`subject_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '科目表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
