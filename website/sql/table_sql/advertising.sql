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

 Date: 20/05/2018 21:56:41
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for advertising
-- ----------------------------
DROP TABLE IF EXISTS `advertising`;
CREATE TABLE `advertising`  (
  `advertising_id` bigint(18) NOT NULL COMMENT '广告ID',
  `advertising_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '广告名（AES加密）',
  `advertising_manufacturer` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '广告商家（AES加密）',
  `advertising_location` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '广告位置（AES加密）',
  `advertising_cost` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '广告费用（AES加密）',
  `advertising_create_time` datetime(0) NOT NULL COMMENT '广告创建时间',
  `advertising_start_time` datetime(0) NOT NULL COMMENT '广告开始展示时间',
  `advertising_end_time` datetime(0) NOT NULL COMMENT '广告结束展示时间',
  `advertising_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '广告状态 0：关闭 1：开启（AES加密）',
  PRIMARY KEY (`advertising_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '广告' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
