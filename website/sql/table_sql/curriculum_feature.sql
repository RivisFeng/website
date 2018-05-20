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

 Date: 20/05/2018 21:57:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for curriculum_feature
-- ----------------------------
DROP TABLE IF EXISTS `curriculum_feature`;
CREATE TABLE `curriculum_feature`  (
  `feature_id` bigint(18) NOT NULL COMMENT '课程特色ID',
  `feature_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '特色名（AES加密）',
  `feature_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '特色状态 0：不显示 1：显示（AES加密）',
  `feature_create_time` datetime(0) NOT NULL COMMENT '特色创建时间',
  PRIMARY KEY (`feature_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '课程特色' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
