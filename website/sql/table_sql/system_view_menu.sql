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

 Date: 03/06/2018 21:11:29
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for system_view_menu
-- ----------------------------
DROP TABLE IF EXISTS `system_view_menu`;
CREATE TABLE `system_view_menu`  (
  `menu_id` bigint(18) NOT NULL COMMENT '菜单ID',
  `menu_url` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '菜单URL',
  `menu_path` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '菜单PATH',
  `menu_component` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '菜单模块',
  `menu_name` varchar(24) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL COMMENT '菜单名称',
  `menu_icon_cls` varchar(64) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `menu_keep_alive` int(1) NOT NULL,
  `menu_require_auth` int(1) NOT NULL,
  `menu_parent_id` bigint(18) NOT NULL,
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '系统前端模块列表菜单' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
