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

 Date: 20/05/2018 21:58:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for derma_background
-- ----------------------------
DROP TABLE IF EXISTS `derma_background`;
CREATE TABLE `derma_background`  (
  `background_id` bigint(18) NOT NULL COMMENT '皮肤背景ID',
  `background_name` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '皮肤背景名称（AES加密）',
  `background_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '皮肤背景连接（AES加密）',
  `background_create_time` datetime(0) NOT NULL COMMENT '皮肤背景创建时间',
  `background_state` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '皮肤背景状态（AES加密）',
  PRIMARY KEY (`background_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '皮肤背景' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
