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

 Date: 20/05/2018 21:58:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for derma_module
-- ----------------------------
DROP TABLE IF EXISTS `derma_module`;
CREATE TABLE `derma_module`  (
  `module_style_id` bigint(18) NOT NULL COMMENT '模块风格ID',
  `module_style_name` varchar(44) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '模块风格名字（AES加密）',
  `module_style_state` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '模块风格状态 0：禁用 1：启用（AES加密）',
  `module_style_create_time` datetime(0) NOT NULL COMMENT '模块风格创建时间',
  PRIMARY KEY (`module_style_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '皮肤模块风格' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
