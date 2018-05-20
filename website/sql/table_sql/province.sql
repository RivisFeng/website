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

 Date: 20/05/2018 21:58:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province`  (
  `province_id` bigint(18) NOT NULL COMMENT '省ID',
  `province_name` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '省名称（AES加密）',
  `province_state` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '省状态 0：禁用 1：启用（AES加密）',
  `province_create_time` datetime(0) NOT NULL COMMENT '省创建时间',
  PRIMARY KEY (`province_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '省' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
