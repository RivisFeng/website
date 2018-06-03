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

 Date: 03/06/2018 21:11:12
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for system_menu_role
-- ----------------------------
DROP TABLE IF EXISTS `system_menu_role`;
CREATE TABLE `system_menu_role`  (
  `system_menu_role_id` bigint(18) NOT NULL COMMENT '资源ID',
  `system_menu_id` bigint(18) NOT NULL COMMENT '菜单ID',
  `system_role_id` bigint(18) NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`system_menu_role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '资源' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
