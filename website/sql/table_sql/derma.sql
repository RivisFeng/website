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

 Date: 20/05/2018 21:58:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for derma
-- ----------------------------
DROP TABLE IF EXISTS `derma`;
CREATE TABLE `derma`  (
  `derma_id` bigint(18) NOT NULL COMMENT '皮肤ID',
  `derma_name` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '皮肤名字（AES加密）',
  `derma_color` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '皮肤主题色（AES加密）',
  `derma_module_style_id` bigint(18) NOT NULL COMMENT '皮肤模块风格ID',
  `derma_background_id` bigint(18) NOT NULL COMMENT '皮肤背景ID',
  `derma_create_time` datetime(0) NOT NULL COMMENT '皮肤创建时间',
  `derma_user_id` bigint(20) NOT NULL COMMENT '用户ID',
  PRIMARY KEY (`derma_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '皮肤' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
