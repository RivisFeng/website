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

 Date: 03/06/2018 21:11:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user`  (
  `admin_id` bigint(18) NOT NULL COMMENT '管理员ID',
  `admin_user_id` bigint(18) NOT NULL COMMENT '用户ID',
  `admin_type` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '管理员类型（AES加密）',
  `admin_state` varchar(24) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '管理员状态（AES加密）',
  `admin_create_time` datetime(0) NOT NULL COMMENT '管理员创建时间',
  PRIMARY KEY (`admin_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '管理员' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin_user
-- ----------------------------
INSERT INTO `admin_user` VALUES (450787042482192384, 450395793623351296, 'q/8u/PKPRgzCK1h2cYfuPg==', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-28 22:26:46');
INSERT INTO `admin_user` VALUES (450787873763885056, 450395793623351296, 'q/8u/PKPRgzCK1h2cYfuPg==', 'CZbTiQP4Znhgc2UCchxkVQ==', '2018-05-28 22:30:04');

SET FOREIGN_KEY_CHECKS = 1;
